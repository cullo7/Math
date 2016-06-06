import pygame
import math
import sys

### SMOOTH SPIRAL ###

def drawSmoothSpiral(screen, count):
  #drawing arcs already covered in a for loop
  for x in range(0,count):
    countdown = count - x
    angStart = (math.pi * (countdown))/10
    diameter = 2*countdown
    pygame.draw.arc(screen, (255,255,255), pygame.Rect(600-countdown, 350-countdown, diameter, diameter), angStart, angStart+math.pi/2, 1)

def main():
  #Set Window dimensions
  windowWidth = 1200
  windowHeight = 700
  pygame.init()
  screen = pygame.display.set_mode((windowWidth, windowHeight))
  screen.fill((0,0,0)) 
  i=0
  
  while True:
    for event in pygame.event.get():
      if event.type == pygame.QUIT:
        pygame.quit()
        sys.exit()  
    pygame.display.update()
    if i < 200:
      drawSmoothSpiral(screen, i)
      i+=1
      pygame.time.wait(1)
    pygame.display.update()

if __name__ == "__main__":
  main()
