package 시험;

import javax.management.ValueExp;

class Vector2D implements Comparable<Vector2D>{
    private int x, y;

    public Vector2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString() { return String.format("(%d,%d)" , x , y);}

    public static Vector2D add(Vector2D v1, Vector2D v2){
        return new Vector2D(v1.x + v2.x, v1.y + v2.y);
    }

    public Vector2D add(Vector2D v1){
        return new Vector2D(x+v1.x,v1.y+y);
    }

    public boolean equeals(Object o){
        Vector2D v = (Vector2D)o; // downcasting
        return x == v.x && y == v.y;
    }

    public int compareTo(Vector2D v){
        if(x > v.x ){
            return 1;
        }else if(x < v.x){
            return -1;
        }else{
            if( y > v.y ){
                return 1;
            }else if(y < v.y){
                return -1;
            }else{
                return 0;
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1,2);
        Vector2D v2 = new Vector2D(3,4);

        System.out.println(v1.equals(v2));
        System.out.println(v1.compareTo(v2));
        System.out.println(v1.add(v2));
        System.out.println(Vector2D.add(v1,v2));
        
    }
}
