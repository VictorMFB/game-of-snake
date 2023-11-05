import java.util.Random;

public class Meal {
        private int x; //Coordenada X
        private int y; //Coordenada Y
    
        //Constructor para inicializar la posición de la comida
        public Meal(int x, int y) {
            this.x = x;
            this.y = y;
        }
    
        //Métodos para obtener y establecer la posición
        public int getX() {
            return x;
        }
    
        public void setX(int x) {
            this.x = x;
        }
    
        public int getY() {
            return y;
        }
    
        public void setY(int y) {
            this.y = y;
        }

            public void generateRandomPosition(int boardWidth, int boardHeight) {
                Random rand = new Random();
                x = rand.nextInt(boardWidth);
                y = rand.nextInt(boardHeight);
        }

    }
    

