import pygame
import math
import sys

### Function with horizontal plane on circles circumference ###

def drawCircleFunction(screen, count):
  #drawing arcs already covered in a for loop 
  pygame.draw.arc(screen, (255,255,255), pygame.Rect(399, 149, 402, 402), 0, 2*math.pi, 1)
  for i in range(201, count):
    x = count - i
    startAng = 2*(math.pi * (x-1))/125
    endAng = 2*(math.pi * x)/125
    #find the height of each trig function at coordinate
    y1 = math.sin(x*math.pi/20)*50
    y2 = math.cos(x*math.pi/20)*50
    radius1 = y1 + 201
    radius2 = y2 + 201
    diameter1 = 2 * radius1
    diameter2 = 2 * radius2
    pygame.draw.arc(screen, (255,255,255), pygame.Rect(600-radius1, 350-radius1, diameter1, diameter1), startAng, endAng, 1)
    pygame.draw.arc(screen, (255,255,255), pygame.Rect(600-radius2, 350-radius2, diameter2, diameter2), startAng, endAng, 1)


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
    pygame.display.update()
if __name__ == "__main__":
  main()
