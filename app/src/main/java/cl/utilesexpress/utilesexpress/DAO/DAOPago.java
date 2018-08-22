package cl.utilesexpress.utilesexpress.DAO;

import cl.utilesexpress.utilesexpress.ENT.Pago;


public class DAOPago {
    public static boolean sqlInsert(Pago pago)
    {
        String sql = String.format("insert into usuario (idUsuario,usuario,clave,idPersona) values ('%d','%s','%s','%d')"
                ,pago.getIdPago()
                ,pago.getCodigo()
                ,pago.getIdUsuario()
                ,pago.getIdPro()
                ,pago.getIdEstadoPag()
                ,pago.getFechaPago()

        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlDelete(Pago pago)
    {
        String sql = String.format("delete from usuario where idUsuario='%d'",

                pago.getIdPago()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlUpdate(Pago pago)
    {
        String sql = String.format("update usuario set usuario = '%s',clave = '%s' where idUsuario='%d'"

                ,pago.getIdPago()
                ,pago.getCodigo()
                ,pago.getIdUsuario()
                ,pago.getIdPro()
                ,pago.getIdEstadoPag()
                ,pago.getFechaPago()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlSelect(Pago pago)
    {
        return true;
    }
}
