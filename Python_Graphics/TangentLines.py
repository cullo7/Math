import pygame
import math
import sys

### Function with horizontal plane on circles circumference ###

def drawTangentLines(screen, radius, count):
#drawing arcs already covered in a for loop 
  pygame.draw.circle(screen, (255,255,255), (600, 350), radius, 1)
  for i in range(count): 
    angle = 2*math.pi*i/80
    adjacent = radius*math.cos(angle)
    opposite = radius*math.sin(angle)
    x = 500+adjacent+radius
    y = 250+radius-opposite
    deltaX = x-(500+radius);
    deltaY = 250+radius-y
    if deltaX ==  0:
      startX = 0
      endX = 1200
      startY = y
      endY = y
    elif deltaY == 0:
      startX = x
      endX = x
      startY = 0
      endY = 700
    else: 
      tangentSlope = (deltaX*-1)/deltaY; 
      startY = y - tangentSlope*-1000
      endY = y - tangentSlope*1000
      startX = x-1000
      endX = x+1000 
    
    pygame.draw.line(screen, (255,255,255), (startX,startY), (endX, endY))

def main():
#Set Window dimensions
  windowWidth = 1200
  windowHeight = 700
  pygame.init()
  screen = pygame.display.set_mode((windowWidth, windowHeight))
  screen.fill((0,0,0)) 
  i = 0
  while True:
    for event in pygame.event.get():
      if event.type == pygame.QUIT:
        pygame.quit()
        sys.exit()
    if i < 81:
      drawTangentLines(screen, 100, i)
      i+=1
      pygame.display.update()
if __name__ == "__main__":
  main()
