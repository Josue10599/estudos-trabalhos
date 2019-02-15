/**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * Temperatura.java
 */
public class Temperatura {

    /**
     * Recebe a temperatura na escala de Kelvin
     * e converte ela para Celsius.
     * 
     * @param kelvin temperatura em Kelvin.
     * @return temperatura em Celsius.
     */
    public float kelvinToCelsius(float kelvin){
        return (kelvin - 273.15f);
    }

    /**
     * Recebe a temperatura na escala de Kelvin
     * e converte ela para Fahrenheit.
     * 
     * @param kelvin temperatura em Kelvin.
     * @return temperatura em Fahrenheit.
     */
    public float kelvinToFahrenheit(float kelvin){
        return ((kelvin - 273.15f) * 9f/5f + 32f);
    }

    /**
     * Recebe a temperatura na escala de Celsius
     * e converte ela para Kelvin.
     * 
     * @param celsius temperatura em Celsius.
     * @return temperatura em Kelvin.
     */
    public float celsiusToKelvin(float celsius){
        return celsius + 273.15f;
    }

    /**
     * Recebe a temperatura na escala de Celsius
     * e converte ela para Fahrenheit.
     * 
     * @param celsius temperatura em Celsius.
     * @return temperatura em Fahrenheit.
     */
    public float celsiusToFahrenheit(float celsius){
        return ((celsius*9f/5f) + 32f);
    }

    /**
     * Recebe a temperatura na escala de Fahrenheit
     * e converte ela para Kelvin.
     * 
     * @param fahrenheit temperatura em Fahrenheit.
     * @return temperatura em Kelvin.
     */
    public float fahrenheitToKelvin(float fahrenheit) {
        return ((fahrenheit - 32f) * 5f/9f + 273.15f);
    }

    /**
     * Recebe a temperatura na escala de Fahrenheit
     * e converte ela para Celsius.
     * 
     * @param fahrenheit temperatura em Fahrenheit.
     * @return temperatura em Celsius.
     */
    public float fahrenheitToCelsius(float fahrenheit){
        return ((fahrenheit - 32f) * 5f/9f);
    }

    /**
     * Recebe a temperatura e a escala em que a temperatura está
     * com os valores a temperatura é convertida na outras escalas
     * e retorna uma string com todos os dados.
     * 
     * @param escala seleciona qual escala é a temperatura 1 = Celsius, 2 = Fahrenheit e 3 = Kelvin.
     * @param temperatura recebe a temperatura.
     * @return strign com todas as conversões.
     */
    public String convert(int escala, float temperatura){
        StringBuilder txt = new StringBuilder();
        float celsius = 0, fahrenheit = 0, kelvin = 0;
        if (escala == 1 || escala == 2 || escala == 3){
            if (escala == 1){
                celsius = temperatura;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
            } else if (escala == 2) {
                fahrenheit = temperatura;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = fahrenheitToKelvin(fahrenheit);
            } else if (escala == 3) {
                kelvin = temperatura;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = kelvinToFahrenheit(kelvin);
            }
            txt.append("\nCelsius " + celsius + "°C\n");
            txt.append("Fahrenheit " + fahrenheit + "F\n");
            txt.append("Kelvin " + kelvin + "K\n");
            return(txt.toString());
        } else {
            return"";
        }
    }
}