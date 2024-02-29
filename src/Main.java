import javax.swing.*;
import java.nio.channels.GatheringByteChannel;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Задача  которая  будет  выводить  информацию  о  футбольной  команде.  В  команде  должны
         * быть  игроки  разных  позиций  (нападающие,  защитники,  вратарь)  и  тренер.  Каждый  игрок
         * должен  иметь  имя,  фамилию,  Localdate  возраст  с  помощь  класса  Period,  рост  и  вес.
         * Тренер должен иметь только имя и фамилию.
         * Программа  должна  использовать  полиморфизм  и  интерфейсы  для  создания  объектов
         * игроков и тренера. Интерфейс должен иметь метод для каждого игрока
         * Также  программа  должна  использовать  абстракцию  для  создания  абстрактного  класса
         * "Спортсмен",  от  которого  будут  наследоваться  все  игроки.  В  абстрактном  классе  должны
         * быть  определены  методы  для  получения  и  установки  имени,  фамилии,  возраста,  роста  и
         * веса игрока.
         * Для  хранения  игроков  и  тренера  нужно  использовать  обычный  массив.  Программа
         * должна выводить информацию о каждом игроке и тренере в отдельной строке.
         * .
         */
        Player [] team = new Player[3];
        team[0] = new Assailant("Cristiano","Ronaldo", LocalDate.of(1985,2,6),190,85);
        team[1] = new Defender("Sergio","Ramos", LocalDate.of(1989,1,4),185,85);
        team[2] = new Goalkeeper("Gianluigi","Buffon", LocalDate.of(1978,1,28),1990,88);

        Coach coach = new Coach("Zinedin","Zidan");

        System.out.println("Team Information: ");
        for(Player player : team){
            player.play();
            if(player instanceof Athlete){
                Athlete athlete = (Athlete) player;
                athlete.displayInfo();
                System.out.println();
                }
            }
        coach.displayInfo();
        }
    }
