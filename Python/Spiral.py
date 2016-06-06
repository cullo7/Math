import pygame
import math
import sys
import time

def drawSpiral(screen, branchNum, diameterIncrement):
  i = 0
  while i < branchNum and i < 700/diameterIncrement:
    angStart = (math.pi * i)/2
    diameter = 10+i*diameterIncrement
    pygame.draw.arc(screen, (255,255,255), pygame.Rect(600-i*diameterIncrement/2, 350-i*diameterIncrement/2, diameter, diameter), angStart, angStart+math.pi/2, 1)
    pygame.display.update()
    time.sleep(.01)
    i+=1
def main():
  windowWidth = 1200
  windowHeight = 700
  screen = pygame.display.set_mode((windowWidth, windowHeight))
  screen.fill((0,0,0))
  pygame.display.update()
  time.sleep(1)
  #pygame.draw.lines(screen, (255,255,255), True, trunk, 3)
  drawSpiral(screen, 40, 20)
  pygame.display.update()
  while True:
    for event in pygame.event.get():
      if event.type == pygame.QUIT:
        pygame.quit()
        sys.exit()  

if __name__ == "__main__":
  main()
