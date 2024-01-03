import websockets.*;

float x = 710;
float y = 880;
float move = 3;
float placey=10;
float placex = random(250,1500);
float placex2 = random(250,1500);
int score=0;
boolean left, right, up, start, leftsay, rightsay, middlesay;
String msg;
WebsocketServer socket;

void setup(){
  
  socket = new WebsocketServer(this, 1337, "/p5websocket");
  size(1920,1000);
  
  
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
  
  if (leftsay == true){
    x = 50;
    delay(500);
    leftsay = false;
  }
  if (rightsay == true){
    x = 1350;
    delay(500);
    rightsay=false;
  }
  if (middlesay == true){
    x = 710;
    delay(500);
    middlesay=false;
  }
  if (start == true){
    placey = placey+ move;
  }
  if (placey>height){
    placey=0;
    placex = random(x+1,x+549);
    placex2 = random(250,1500);
    move = move + 0.5;
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

void webSocketServerEvent(String msg){
 println(msg);
 if (msg.contains("left")){
   leftsay = true;
 }
 
 if (msg.contains("right")){
   rightsay = true;
 }
 
 if (msg.contains("up")){
   middlesay = true;
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
