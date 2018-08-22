package cl.utilesexpress.utilesexpress.DAO;

import cl.utilesexpress.utilesexpress.ENT.Unidad;

public class DAOUnidad {

    public static boolean sqlInsert(Unidad uni)
    {
        String sql = String.format("insert into usuario (idUsuario,usuario,clave,idPersona) values ('%d','%s','%s','%d')"
                ,uni.getIdUnidad()
                ,uni.getDescripcion()


        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlDelete(Unidad uni)
    {
        String sql = String.format("delete from usuario where idUsuario='%d'",

                uni.getIdUnidad()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlUpdate(Unidad uni)
    {
        String sql = String.format("update usuario set usuario = '%s',clave = '%s' where idUsuario='%d'"

                ,uni.getIdUnidad()
                ,uni.getDescripcion()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlSelect(Unidad uni)
    {
        return true;
    }
}
