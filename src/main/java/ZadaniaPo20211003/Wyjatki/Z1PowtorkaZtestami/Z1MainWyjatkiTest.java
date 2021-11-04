package ZadaniaPo20211003.Wyjatki.Z1PowtorkaZtestami;

import ZadaniaPo20211003.Wyjatki.Z1.CannotDivideByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Z1MainWyjatkiTest {

    @Test
    void isDividingValues() {  //true
        //given
        double expectedResult = 2;
        //when
        double result = Z1MainWyjatki.divide(8, 4);
        //then
        assertEquals(expectedResult, result);
        //assertThat(result).isEqualTo(expectedResult);
    }


    @Test //AW: spisane z zajęć z testowania
    void isDzieleniePrzezZeroException() {
    /*    assertThrows(DzieleniePrzezZero.class,
                () -> Z1MainWyjatki.divide(3, 0),
                "dupa");*/

        assertThatThrownBy(() -> Z1MainWyjatki.divide(3, 0))
                .hasMessage("dupa")
                .isInstanceOf(DzieleniePrzezZero.class);


    }

}