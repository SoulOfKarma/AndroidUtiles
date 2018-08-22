package cl.utilesexpress.utilesexpress.DAO;

import cl.utilesexpress.utilesexpress.ENT.VistaProducto;

public class DAOVistaPro {

    public static boolean sqlInsert(VistaProducto vis)
    {
        String sql = String.format("insert into usuario (idUsuario,usuario,clave,idPersona) values ('%d','%s','%s','%d')"
                ,vis.getIdPro()
                ,vis.getIdProVista()
                ,vis.getIdVista()


        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlDelete(VistaProducto vis)
    {
        String sql = String.format("delete from usuario where idUsuario='%d'",

                vis.getIdVista()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlUpdate(VistaProducto vis)
    {
        String sql = String.format("update usuario set usuario = '%s',clave = '%s' where idUsuario='%d'"

                ,vis.getIdPro()
                ,vis.getIdProVista()
                ,vis.getIdVista()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlSelect(VistaProducto vis)
    {
        return true;
    }
}
