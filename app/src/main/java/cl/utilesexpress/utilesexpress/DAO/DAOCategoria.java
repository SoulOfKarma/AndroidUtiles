package cl.utilesexpress.utilesexpress.DAO;

import cl.utilesexpress.utilesexpress.ENT.Categoria;

public class DAOCategoria {
    public static boolean sqlInsert(Categoria cat)
    {
        String sql = String.format("insert into usuario (idUsuario,usuario,clave,idPersona) values ('%d','%s','%s','%d')"
                ,cat.getIdCategoria()
                ,cat.getNombreCarCorto()
                ,cat.getNombreCat()


        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlDelete(Categoria cat)
    {
        String sql = String.format("delete from usuario where idUsuario='%d'",

                cat.getIdCategoria()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlUpdate(Categoria cat)
    {
        String sql = String.format("update usuario set usuario = '%s',clave = '%s' where idUsuario='%d'"

                ,cat.getIdCategoria()
                ,cat.getNombreCarCorto()
                ,cat.getNombreCat()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlSelect(Categoria cat)
    {
        return true;
    }
}
