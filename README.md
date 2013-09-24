FlapJack
========

Flapjack is a Java application developed during the Hacker Olympics 2013 final round together with a great team of 10 people. Its purpose is optimizing card counting strategies for blackjack players. 

The GUI offers a (small for now) list of popular Vegas casinos that the user can pick (because different casinos have different variations of rules) and the game strategy that he wants to use:
  - Basic Strategy, which just tells you what to do for different configurations of the game (hit, stand, split or double), so basically no card counting involved (more info here: http://en.wikipedia.org/wiki/Blackjack#Basic_strategy)

  - Counting Strategy, which implements one of the classical counting strategies found on wikipedia (http://en.wikipedia.org/wiki/Card_counting#Blackjack)
  
  - Optimized Counting, which starts from one of the classical counting strategies and does a few millions iterations in order to find a better strategy that offers a positive expected value of winning
   
The user also selects the number of games that he wants the simulation to be ran on. (a bigger number of games is obviously a better estimate of the long-term behavior of the selected strategy). 

After the simulation is ran, he can see the expected revenue after that number of games, a revenue vs number of games graph and the exact card-coefficient bijection that he has to use in order to achieve that performance. 
