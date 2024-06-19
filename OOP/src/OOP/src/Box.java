
class Box {
   private double w, height, depth;//instance variable
   
   Box(double width, double height, double depth){//method local variable 
	  this.w = width;
	  this.height = height;
	  this.depth = depth;
	   
   }
   Box(double side){
	   this(side, side, side);
   }
   
   String getDimentions(){
	   return "Box dimentions" +" " +this.w +" " + this.height +" " + this.depth;
   }
   
   double getVolume() {
	   return w * height * depth;
	  
   }
   
   //add a method (API) to check equality of two boxes
   boolean isEqual(Box anotherBox) {
	   return this.w == anotherBox.w && this.depth == anotherBox.depth && this.height
			   == anotherBox.height;
   }
   
   //add a method to create a new box with user provided offset from earlier box
   Box createNewBox(double wOff, double hOff, double dOff) {
	   Box newBox = new Box(this.w + wOff, this.height + hOff, this.depth + dOff);
	   return newBox;
	  
   }
  
   //add a method for double box width if volume > 100;
   public void doubleBoxWidth() {
	   double volume = getVolume();
	   if(volume > 100) {
		   this.w*=2;
	   }
	   //return this.w;;
   }
   
   
   
  
}
