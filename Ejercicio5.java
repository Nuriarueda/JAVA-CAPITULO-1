/* Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente. */
public class Ejercicio5 {
    public static void main (String[] args){
        System.out.println("        ┌───────┬────────┬───────────┬────────┬─────────┐");
        System.out.println("        │ Lunes │ Martes │ Miércoles │ Jueves │ Viernes │");
        System.out.println("┌───────├───────┼────────┼───────────┼────────┼─────────┤");
        System.out.println("│ 8:15  │ \033[93mPROG\033[37m  │        │           │  \033[93mPROG\033[37m  │         │");
        System.out.println("├───────┼───────┼────────┼───────────┼────────┼─────────┤");
        System.out.println("│ 9:15  │ \033[93mPROG\033[37m  │        │           │  \033[93mPROG\033[37m  │         │");
        System.out.println("├───────├───────┼────────┼───────────┼────────┼─────────┤");
        System.out.println("│ 10:15 │ \033[93mPROG\033[37m  │  \033[94mBBDD\033[37m  │   \033[93mPROG\033[37m    │  \033[93mPROG\033[37m  │         │");
        System.out.println("├───────┼───────┼────────┼───────────┼────────┼─────────┤");
        System.out.println("│ 11:15 │  \033[91mR\033[37m    │   \033[91mE\033[37m    │    \033[91mCR\033[37m     │   \033[91mE\033[37m    │    \033[91mO\033[37m    │");
        System.out.println("├───────┼───────┼────────┼───────────┼────────┼─────────┤");
        System.out.println("│ 11:45 │       │  \033[94mBBDD\033[37m  │   \033[93mPROG\033[37m    │  \033[94mBBDD\033[37m  │         │");
        System.out.println("├───────┼───────┼────────┼───────────┼────────┼─────────┤");
        System.out.println("│ 12:45 │       │        │   \033[94mBBDD\033[37m    │  \033[94mBBDD\033[37m  │         │");
        System.out.println("├───────┼───────┼────────┼───────────┼────────┼─────────┤");
        System.out.println("│ 13:45 │       │        │   \033[94mBBDD\033[37m    │        │         │");
        System.out.println("└───────┴───────┴────────┴───────────┴────────┴─────────┘");
    }
}
