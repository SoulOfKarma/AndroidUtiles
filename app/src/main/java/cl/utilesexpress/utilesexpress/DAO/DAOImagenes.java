package cl.utilesexpress.utilesexpress.DAO;

import cl.utilesexpress.utilesexpress.ENT.Imagenes;

public class DAOImagenes {

    public static boolean sqlInsert(Imagenes ima)
    {
        String sql = String.format("insert into usuario (idUsuario,usuario,clave,idPersona) values ('%d','%s','%s','%d')"
                ,ima.getIdSlide()
                ,ima.getImagenSlide()
                ,ima.getTituloSlide()
                ,ima.getPosicion()

        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlDelete(Imagenes ima)
    {
        String sql = String.format("delete from usuario where idUsuario='%d'",

                ima.getIdSlide()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlUpdate(Imagenes ima)
    {
        String sql = String.format("update usuario set usuario = '%s',clave = '%s' where idUsuario='%d'"

                ,ima.getIdSlide()
                ,ima.getImagenSlide()
                ,ima.getTituloSlide()
                ,ima.getPosicion()
        );
        //db.getinstance().sqlexecute(sql);
        return true;
    }

    public static boolean sqlSelect(Imagenes ima)
    {
        return true;
    }
}
