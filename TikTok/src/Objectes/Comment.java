package Objectes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Like
public class Comment {
    private final String nickVisualitzador;
    private int idVideo;
    private final String nomVideo;
    private String Comentario;

    public String getNomVideo() {
        return nomVideo;
    }

    public Comment(String nickVisualitzador, String nomVideo, String comentario) {
        this.nickVisualitzador = nickVisualitzador;
        this.nomVideo = nomVideo;
        this.idVideo = 0;
        this.Comentario = comentario;
    }
    
    public Comment(String nickVisualitzador, int idVideo, String comentario) {
        this.nickVisualitzador = nickVisualitzador;
        this.idVideo = idVideo;
        nomVideo = "";
        this.Comentario = comentario;
    }

    public String getComentario() {
        return Comentario;
    }
    
    
    public String getNickVisualitzador() {
        return nickVisualitzador;
    }
    
    public int getIdVideo() {
        return idVideo;
    }
    
    public void setVideo(int id)
    {
        this.idVideo = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Like de " + nickVisualitzador);
        if (!nomVideo.isEmpty())
        {
            sb.append("al video " + nomVideo);
        }
        else
        {
            sb.append("al video " + idVideo);
        }
        return sb.toString();
    }
    
    
}