package netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void testRadio() {
        Radio radio = new Radio();

        //увеличиваем громкость
        radio.increaseSound();
        assertEquals(10, radio.getCurrentSound());

        //дальнейшее нажатие ни к чему не привдит, значение остается прежним
        radio.increaseSound();
        assertEquals(10, radio.getCurrentSound());


        //уменьшаем громкость
        radio.decreaseSound();
        assertEquals(9, radio.getCurrentSound());


        //переключаем радиостанцию на следующую
        radio.nextStation();
        assertEquals(0, radio.getStationNumber());


        //переключаем радиостанцию на предыдущую
        radio.prevStation();
        assertEquals(9, radio.getStationNumber());


        // выставляем станцию с цифрового пульта

        radio.setStation(5);

    }
}