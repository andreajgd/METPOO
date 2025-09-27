//data acces object
package dao;

import modelo.Visit;
import utileria.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VisitDao {

    public void insert(Visit visit) throws SQLException {
        String sql = "INSERT INTO visit (visitor_name, visitor_document, visitor_email, host_name, reason) VALUES (?,?,?,?,?)";
        try (Connection conn = Conexion.get();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, visit.getVisitorName());
            stmt.setString(2, visit.getVisitorDocument());
            stmt.setString(3, visit.getVisitorEmail());
            stmt.setString(4, visit.getHostName());
            stmt.setString(5, visit.getReason());
            stmt.executeUpdate();
        }
    }

    public List<Visit> findAll() throws SQLException {
        List<Visit> visits = new ArrayList<>();
        String sql = "SELECT * FROM visit";
        try (Connection conn = Conexion.get();
             Statement stmt = conn.createStatement();


             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Visit v = new Visit();
                v.setId(rs.getLong("id"));
                v.setVisitorName(rs.getString("visitor_name"));
                v.setVisitorDocument(rs.getString("visitor_document"));
                v.setVisitorEmail(rs.getString("visitor_email"));
                v.setHostName(rs.getString("host_name"));
                v.setReason(rs.getString("reason"));
                v.setVisitEntry(rs.getTimestamp("visit_entry").toLocalDateTime());
                Timestamp exit = rs.getTimestamp("visit_exit");
                if (exit != null) {
                    v.setVisitExit(exit.toLocalDateTime());
                }
                visits.add(v);
            }
        }
        return visits;
    }

    public void updateExit(Long id) throws SQLException {
        String sql = "UPDATE visit SET visit_exit = now() WHERE id = ?";
        try (Connection conn = Conexion.get();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }

    public void delete(Long id) throws SQLException {
        String sql = "DELETE FROM visit WHERE id = ?";
        try (Connection conn = Conexion.get();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}
