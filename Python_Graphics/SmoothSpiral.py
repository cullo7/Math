import pygame
import math
import sys

def drawSpiral(screen, count, diameterIncrement):
  for x in range(0,count):
    countdown = count - x
    angStart = (math.pi * (countdown))/2
    diameter = 10+(countdown)*diameterIncrement
    pygame.draw.arc(screen, (255,255,255), pygame.Rect(600-countdown*diameterIncrement/2, 350-countdown*diameterIncrement/2, diameter, diameter), angStart, angStart+math.pi/2, 1)
def main():
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
    if i < 20:
      drawSpiral(screen, i, 20)
      i+=1
      pygame.time.wait(500)
    pygame.display.update()
if __name__ == "__main__":
  main()