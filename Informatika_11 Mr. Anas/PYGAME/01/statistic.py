class Statistic:
    intro = True
    game_active = True
    play_again = False
    
    high_score = 0
    score = 0
    level = 1
    life = 3

    @staticmethod
    def reset_game():
        Statistic.high_score = 0
        Statistic.level = 1
        Statistic.life = 3
