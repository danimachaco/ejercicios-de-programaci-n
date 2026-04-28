package com.example.elrastro.repository;

import com.example.elrastro.model.Producto;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoDAO {

    private String URL = "jdbc:mysql://localhost:3306/elrastro";
    private String user = "root";
    private String password = "1234";

    public ProductoDAO() {
        crearTablaSiNoExiste();
    }


    private void crearTablaSiNoExiste() {
        String sql = """
            CREATE TABLE IF NOT EXISTS productos (
                num_ref INTEGER PRIMARY KEY,
                nombre TEXT,
                categoria TEXT,
                precio REAL,
                stock INTEGER
            )
        """;

        try (Connection conn = DriverManager.getConnection(URL,user,password);
             Statement stmt = conn.createStatement()) {

            stmt.execute(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Listamos los usuarios
    public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<>();

        String sql = "SELECT * FROM productos";

        try (Connection conn = DriverManager.getConnection(URL, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Producto p = new Producto(
                        rs.getInt("num_ref"),
                        rs.getString("nombre"),
                        rs.getString("categoria"),
                        rs.getDouble("precio"),
                        rs.getInt("stock")
                );
                productos.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return productos;
        
    }

    // Insertamos usuarios
    public Producto insertarProducto(Producto producto) {

//        String ruta = "C:\\Users\\danim\\OneDrive\\Desktop\\Programacion\\Descargas Programacion\\pruebaProyecto.csv";

        String sql = "INSERT INTO productos (num_ref, nombre, categoria, precio, stock) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, user,password);
             PreparedStatement ps = conn.prepareStatement(sql)) {

//            FileWriter fw = new FileWriter(ruta, true);
//            BufferedWriter bw = new BufferedWriter(fw);

            ps.setInt(1, producto.getNum_ref());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getCategoria());
            ps.setDouble(4, producto.getPrecio());
            ps.setInt(5, producto.getStock());
            ps.executeUpdate();

//            bw.write("producto: " + usuario.getUsuario() + " password: " + usuario.getPassword());
//            bw.newLine();
//            bw.write(usuario.getPassword());
//            bw.newLine();
//            bw.write(usuario.getUsuario());
//            bw.newLine();

//            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return producto;
    }

    public void eliminarProducto(int numRef) {

        String sql = "DELETE FROM productos WHERE num_ref = ?";

        try (Connection conn = DriverManager.getConnection(URL,user,password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1,numRef);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
