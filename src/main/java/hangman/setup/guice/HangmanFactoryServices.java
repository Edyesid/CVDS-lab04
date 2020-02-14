/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

/**
 *
 * @author 2106913
 */

import hangman.model.*;
import hangman.model.dictionary.*;
import hangman.view.*;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
        bind(GameScore.class).to(PowerScore.class);
        bind(Language.class).to(Spanish.class);
        bind(HangmanPanel.class).to(HangmanNoviolentoPanel.class);
        bind(HangmanDictionary.class).to(SpanishDictionaryDataSource.class);
    }

}
