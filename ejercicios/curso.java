package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class curso {
    private String titulo;
    private float duracion; //Expresada en horas
    private int videos; //cantidad de vídeos
    private int alumnos; //Cantidad de alumnos

    public curso(String titulo, float duracion, int videos, int alumnos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.videos = videos;
        this.alumnos = alumnos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }


    public curso() {
        List<curso> cursos = new ArrayList<>();
        cursos.add(new curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
    }
    

    /**Obtener la cantidad de cursos con una duración mayor a 5 horas.
        Obtener la cantidad de cursos con una duración menor a 2 horas.
        Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.
        Mostrar en consola el título de los 3 cursos con mayor duración.
        Mostrar en consola la duración total de todos los cursos.
        Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.
        Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.
        Obtener el curso con mayor duración.
        Crear una lista de Strings con todos los titulos de los cursos.**/


}
