import pygame
import os

from conf import Conf

class Playbutton:

    def  __init__(self,Game):
        self.Screen = Game.screen
        self.Screen_rect = Game.screen_rect

        image_path = os.path.join(Conf.BASE_DIR,"assets","play.png")
        self.image = pygame.image.load(image_path)
        self.rect = self.image.get_rect()

        self.image = pygame.transform.scale(self.image,(self.rect.width//10,  self.rect.height//10))
        self.rect = self.image.get_rect()

        self.rect.center = self.Screen_rect.center
        self.rect.y += 100

    def show(self):
        self.Screen.blit(self.image,self.rect)
