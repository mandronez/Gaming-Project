float x = 710;
float y = 880;
float move = 5;
float placey=10;
float placex = random(250,1500);
float placex2 = random(250,1500);
int score=0;
boolean left, right, up, start;

void setup(){
  
  fullScreen();
  
  
}


void draw() {
  background(#02E2F5);
  if (start == false){
    textSize(128);
    text("Enter To Start", 550, 550);
  }
  textSize(25);
  text("Score Counter: "+ score, 20, 50);
  
  fill(255);
  rect(x, y, 500, 150);
  
  fill(255,0,0);
  rect(placex, placey, 22, 50);
  
  fill(255,0,0);
  rect(placex2,placey,22,50);
  
  fill(255);
  rect(640,0,1,height);
  
  fill(225);
  rect(1280,0,1,height);
  
  if (left == true){
    x = 50;
  }
  if (right == true){
    x = 1350;
  }
  if (up == true){
    x = 710;
  }
  if (start == true){
    placey = placey+ move;
  }
  if (placey>height){
    placey=0;
    placex = random(x+1,x+549);
    placex2 = random(250,1500);
    move = move + 1;
    score = score + 1;
  }
  
  if((placex>x)&&(placex<x+550)&&(placey>y)&&(placey<y+150)){
    placey=0;
    textSize(125);
    text("Score Counter: "+ score, 550, 750);
    start = false;
  }
  if((placex2>x)&&(placex2<x+550)&&(placey>y)&&(placey<y+150)){
    placey=0;
    textSize(125);
    text("Score Counter: "+ score, 550, 750);
    start = false;
  }
}

public void keyPressed() {
  if (keyCode == LEFT){
    left = true;
  }
  if (keyCode == RIGHT){
    right = true;
  }
  if (keyCode == UP){
    up = true;
  }
  if (keyCode == ENTER){
    start=true;
    score = 0;
  }
  
}

public void keyReleased() {
  if (keyCode == LEFT){
    left = false;
  }
  if (keyCode == RIGHT){
    right = false;
  }
  if (keyCode == UP){
    up = false;
  }
}
