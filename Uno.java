public class Uno{
    private class Dos{
        private int edad;
        private String nombre;
        private String direcccion;
        //public Dos(){}
        public void setDirecccion(String direcccion) {
            this.direcccion = direcccion;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getDirecccion() {
            return direcccion;
        }
        public int getEdad() {
            return edad;
        }
        public String getNombre() {
            return nombre;
        }

    }
    public static void main(String[] args) {
            Dos d1=null;
            d1.setNombre("Gabriela");
    }

}