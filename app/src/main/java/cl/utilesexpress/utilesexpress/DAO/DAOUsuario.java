package cl.utilesexpress.utilesexpress.DAO;

import cl.utilesexpress.utilesexpress.ENT.Usuario;

public class DAOUsuario {
    public static boolean sqlInsert(Usuario usu)
    {
        String sql = String.format("insert into usuario (idUsuario,usuario,clave,idPersona) values ('%d','%s','%s','%d')"
                ,usu.getIdUsuario()
                ,usu.getNombre()
                ,usu.getApellido()
                ,usu.getNombreUsuario()
                ,usu.getCorreoUsuario()
                ,usu.getPasswordUsuario()
                ,usu.getDireccionUsuario()
                ,usu.getTelefono()
                ,usu.isActivo()
                ,usu.isAdmin()
                ,usu.getFechaCreacion()

        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlDelete(Usuario usu)
    {
        String sql = String.format("delete from usuario where idUsuario='%d'",

                usu.getIdUsuario()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlUpdate(Usuario usu)
    {
        String sql = String.format("update usuario set usuario = '%s',clave = '%s' where idUsuario='%d'"

                ,usu.getIdUsuario()
                ,usu.getNombre()
                ,usu.getApellido()
                ,usu.getNombreUsuario()
                ,usu.getCorreoUsuario()
                ,usu.getPasswordUsuario()
                ,usu.getDireccionUsuario()
                ,usu.getTelefono()
                ,usu.isActivo()
                ,usu.isAdmin()
                ,usu.getFechaCreacion()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlSelect(Usuario usu)
    {
        return true;
    }
}
