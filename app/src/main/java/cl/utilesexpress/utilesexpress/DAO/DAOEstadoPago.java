package cl.utilesexpress.utilesexpress.DAO;

import cl.utilesexpress.utilesexpress.ENT.EstadoPago;

public class DAOEstadoPago {
    public static boolean sqlInsert(EstadoPago est)
    {
        String sql = String.format("insert into usuario (idUsuario,usuario,clave,idPersona) values ('%d','%s','%s','%d')"
                ,est.getIdEstadoPago()
                ,est.getDescripcionEst()

        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlDelete(EstadoPago est)
    {
        String sql = String.format("delete from usuario where idUsuario='%d'",

                 est.getIdEstadoPago()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlUpdate(EstadoPago est)
    {
        String sql = String.format("update usuario set usuario = '%s',clave = '%s' where idUsuario='%d'"

                ,est.getIdEstadoPago()
                ,est.getDescripcionEst()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlSelect(EstadoPago est)
    {
        return true;
    }
}
