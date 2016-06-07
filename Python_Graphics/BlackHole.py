import pygame
import math
import sys
import random

### Function with horizontal plane on circles circumference ###

def drawCircleFunction(screen, count):
  #drawing arcs already covered in a for loop 
  pygame.draw.arc(screen, (255,255,255), pygame.Rect(399, 149, 402, 402), 0, 2*math.pi, 1)
  for i in range(201,count):
    x = count - i
    print("drawCircle loop #%d" % x )
    startAng = 2*(math.pi * (x-1))/100
    endAng = 2*(math.pi * x)/100
    y = mathFunction(x)
    radius = y+201
    diameter = 2*radius
    pygame.draw.arc(screen, (255,255,255), pygame.Rect(600-radius, 350-radius, diameter, diameter), startAng, endAng, 1)

def mathFunction(xValue):
  return random.randrange(xValue);

def main():
  #Set Window dimensions
  windowWidth = 1200
  windowHeight = 700
  pygame.init()
  screen = pygame.display.set_mode((windowWidth, windowHeight))
  screen.fill((0,0,0)) 
  i=202
   
  while True:
    for event in pygame.event.get():
      if event.type == pygame.QUIT:
        pygame.quit()
        sys.exit()  
    pygame.display.update()
    if i < 1000:
      drawCircleFunction(screen, i)
      i+=1
      pygame.time.wait(1)
    pygame.display.update()

if __name__ == "__main__":
  main()
