/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


/**
 *
 * @author HP
 */
public class Controlador implements Controllers.Funciones {

    @Override
    public int suma(int a, int b) {
      int rep= a+b;
return rep;
    }

//    ResultSet datos, dato;
//    Statement st;
//    Connection cn;
//
//    public Controlador() {
//        ConexionDB con = new ConexionDB();
//        cn = con.conectar();
//    }

//    @Override
//    public List<String> hola(String id) {
//
//        String consulta = "Select * from cuentas_usuario where nom_cue ='" + id + "'";
//        List<String> usu;
//        try {
//            st = cn.createStatement();
//            dato = st.executeQuery(consulta);
//            if (!dato.next()) {
//
//                return null;
//            }
//            usu = new ArrayList<>();
//
//            usu.add(dato.getString(1));
//            usu.add(dato.getString(2));
//            usu.add(dato.getString(3));
//            usu.add(dato.getString(4));
//            usu.add(dato.getString(5));
//            usu.add(dato.getString(6));
//            usu.add(dato.getString(7));
//            usu.add(dato.getString(8));
//
//        } catch (SQLException ex) {
//            return null;
//        }
//        return usu;
    }
//
//}
//        ArrayList<Usuario> usua = new ArrayList();
//       try {
//            st = cn.createStatement();
//            dato = st.executeQuery(consulta);
//            while (dato.next()) {
//                usu = new Usuario();
//                usu.setId_cue(dato.getString(1));
//                usu.setNom_cue(dato.getString(2));
//                usu.setCla_cue(dato.getString(3));
//                usu.setFec_cre_cue(dato.getString(4));
//                usu.setCed_usu(dato.getString(5));
//                usu.setNom_usu(dato.getString(6));
//                usu.setApe_usu(dato.getString(7));
//                usu.setFec_nac_usu(dato.getString(8));
//
//                usua.add(usu);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return usua;        String consulta = "Select * from cuentas_usuario where id_cue='"+id+"'";
//        Usuario usu;
// 
