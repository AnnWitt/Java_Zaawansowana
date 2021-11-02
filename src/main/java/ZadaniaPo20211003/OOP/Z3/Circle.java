package ZadaniaPo20211003.OOP.Z3;

 class Circle extends Shape{
    float radius;

      Circle(float radius) {
         this.radius = radius;
     }

      Circle(String color, boolean isFilled, float radius) {
         super(color, isFilled);
         this.radius = radius;
     }

      Circle() {
         this.color="unknown";
         this.isFilled=false;
         this.radius = 1;
     }

     float getPerimeter(){
          return (float)(2*Math.PI*this.radius);
     }

     float getArea(){
         return (float)(Math.PI*this.radius*this.radius);
     }

     @Override
     public String toString() {
         return "Circle with radius " +
                  radius +
                 " which is a subclass of " + super.toString();
     }

     //----------------------
      float getRadius() {
         return radius;
     }

      void setRadius(float radius) {
         this.radius = radius;
     }
 }
