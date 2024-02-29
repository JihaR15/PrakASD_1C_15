package P2.dragonGame;

public class Dragon15 {
    int x, y, width, height;

    void moveLeft(){
        if (x > 0) {
            x--;
            
        } else {
            detectCollision(x,y);
        }
    }

    void moveRight(){
        if (x < width) {
            x++;
            
        } else {
            detectCollision(x,y);
        }
    }

    void moveUp(){
        if (y > 0) {
            y--;
            
        } else {
            detectCollision(x,y);
        }
    }

    void moveDown(){
        if (y < height) {
            y++;
            
        } else {
            detectCollision(x,y);
        }
    }

    void printPosition(){
        System.out.println(x + " " + y);
    }

    void detectCollision(int x, int y){
        System.out.println("Game Over");
    }
}
