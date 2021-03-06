package io.github.followsclosley.monopoly;

import io.github.followsclosley.monopoly.street.RealEstate;

public class DummyAI implements ArtificialIntelligence {

    private Player player;

    @Override
    public void init(Player player) {
        System.out.println(player.getName() + ": init");
        this.player = player;
    }

    @Override
    public void beforeRoll(MutableGame game) {
        //System.out.println(player.getName() + ": beforeRoll");
    }

    @Override
    public void afterRoll(MutableGame game, Street landed, Dice dice) {
        System.out.println(player.getName() + ": afterRoll("+landed.getName()+", "+dice+")");

        if( landed instanceof RealEstate re && !re.isOwned() ){
            System.out.println(player.getName() + ": "+ landed.getName() +" is not owned, I will buy it!");
            game.purchase(re);
        }
    }
}
