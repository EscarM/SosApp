package ado.edu.itla.sosapp.repositorio.usuario;

import android.content.ContentValues;
import android.content.Context;

import ado.edu.itla.sosapp.entidad.Usuario;

public class UsuarioRepositorioImpl implements UsuarioRepositorio {

    private Context context;

    public UsuarioRepositorioImpl(Context context) {
        this.context = context;
    }

    @Override
    public void guardar(Usuario usuario) {

        ContentValues cv= new ContentValues();
        cv.put("email",usuario.getEmail());
        cv.put("password",usuario.getPassword());
        cv.put("nombre",usuario.getNombre());

        //TODO:guardar usuario

    }

    @Override
    public Usuario buscar(String email) {
        return null;
    }
}
