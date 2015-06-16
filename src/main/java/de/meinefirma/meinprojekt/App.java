package de.meinefirma.meinprojekt;

import org.apache.log4j.Logger;

public class App
{
   private static final Logger LOGGER = Logger.getRootLogger();

   public static void main( String[] args )
   {
      LOGGER.info( "---- Hallo Logger! ----" );
   }
}

