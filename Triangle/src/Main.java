 class Main {
    public static final double x = 1.1, y = 0, r = 1;

  public static void main(String[] args) {
      output();
  }

    private static void output() {
        System.out.println(Main.belongsToTriangle());
    }

    private static boolean belongsToTriangle() {
        double k,b;
        if (x<-2)
            return false;
        else if (x==-2){
            if(y==0)
                return true;
            else
                return false;
        }
        if(x<0){
            k = y/(x+2);
            b = y - k*x;
            if((b <= 1) && (b >= -1))
                return true;
            else
                return false;
        }
        else{
           if(x*x + y*y == r*r)
               return true;
            else
               return false;
        }

    }

  
}