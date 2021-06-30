package thead;

public class Java1001 {

	public static void main(String[] args) {
     
		
		// Se instancian dos nuevos objetos Thread
        Thread hiloA = new Thread( new MiHilo(),"hiloA" );
        Thread hiloB = new Thread( new MiHilo(),"hiloB" );

        // Se arrancan los dos hilos, para que comiencen su ejecución
        hiloA.start();
        hiloB.start();
    
        // Aquí se retrasa la ejecución un segundo y se captura la
        // posible excepción que genera el método, aunque no se hace
        // nada en el caso de que se produzca
        try {
            Thread.currentThread().sleep( 1000 );
        }catch( InterruptedException e ){}

        // Presenta información acerca del Thread o hilo principal 
        // del programa
        System.out.println( Thread.currentThread() );        

        // Se detiene la ejecución de los dos hilos
        hiloA.stop();
        hiloB.stop();
        }
		
		
		
	}

class NoHaceNada {
	// Esta clase existe solamente para que sea heredada por la clase
	// MiHilo, para evitar que esta clase sea capaz de heredar la clase
	// Thread, y se pueda implementar el interfaz Runnable en su
	// lugar
	}

	class MiHilo extends NoHaceNada implements Runnable {
	    public void run() {
	        // Presenta en pantalla información sobre este hilo en particular
	        System.out.println( Thread.currentThread() );
	        }
	    }
