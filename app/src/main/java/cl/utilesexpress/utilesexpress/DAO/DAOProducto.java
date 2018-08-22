package cl.utilesexpress.utilesexpress.DAO;

import cl.utilesexpress.utilesexpress.ENT.Producto;

public class DAOProducto {
    public static boolean sqlInsert(Producto pro)
    {
        String sql = String.format("insert into usuario (idUsuario,usuario,clave,idPersona) values ('%d','%s','%s','%d')"
                ,pro.getIdPro()
                ,pro.getNombreAcortadoPro()
                ,pro.getNombrePro()
                ,pro.getCodePro()
                ,pro.getDescripcionPro()
                ,pro.getOffertxt()
                ,pro.getImagen()
                ,pro.getLink()
                ,pro.isExiste()
                ,pro.getPrecio()
                ,pro.getIdCategoria()
                ,pro.getIdUnidad()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlDelete(Producto pro)
    {
        String sql = String.format("delete from usuario where idUsuario='%d'",

                pro.getIdPro()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlUpdate(Producto pro)
    {
        String sql = String.format("update usuario set usuario = '%s',clave = '%s' where idUsuario='%d'"

                ,pro.getIdPro()
                ,pro.getNombreAcortadoPro()
                ,pro.getNombrePro()
                ,pro.getCodePro()
                ,pro.getDescripcionPro()
                ,pro.getOffertxt()
                ,pro.getImagen()
                ,pro.getLink()
                ,pro.isExiste()
                ,pro.getPrecio()
                ,pro.getIdCategoria()
                ,pro.getIdUnidad()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlSelect(Producto pro)
    {
        return true;
    }
}
