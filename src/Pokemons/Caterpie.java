/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import Sons.TocarSom;
import TiposDePokemon.*;
import java.util.Random;

/**
 *
 * @author Mathews
 */
public class Caterpie
{
    protected String nome = "Caterpie";
    protected float peso = 2.9f;
    protected String som = "CaterpieSound";

    protected int nivel = 0;
    protected int xp = 0;
    protected int qtdAtaques = 5;

    public int hp = 200;
    protected int ataqueBasico = 80;
    protected int defesaBasica = 67;
    protected int ataqueEspecial = 120;
    protected int defesaEspecial = 40;
    protected int velocidade = 85;

    Random attack = new Random();
    protected int dano;

    public Caterpie()
    {
    }

    Random qualDef = new Random();
    Random defesa = new Random();
    int opcao = qualDef.nextInt(2);
    int defB = defesa.nextInt(defesaBasica);
    int defE = defesa.nextInt(defesaEspecial);

    /**
     * Classe que define o Dano que o pokemon sofre
     *
     * @param dano
     */
    public void sofrerDano(int dano)
    {
        if (opcao == 0)              //defesa especial
        {
            this.hp = this.hp - (dano - 30);
        }
        else                    //defesa basica
        {
            this.hp = this.hp - (dano - 20);
        }
    }

    /**
     * Classe que chama o audio para ser executado
     *
     */
    public void emitesom()
    {
        TocarSom som1 = new TocarSom();
        som1.play(som);
    }

    /**
     * Apresenta os dados do pokemon
     *
     * @return
     */
    public String apresentar()
    {
        emitesom();
        return "===========Informações do Pokemon===========<br>"
                + "<br>\n Nome: " + getNome()
                + "<br>\n Peso: " + getPeso()
                + "<br>\n Nível: " + getNivel()
                + "<br>\n Xp Atual: " + getXp()
                + "<br>\n HP: " + getHp()
                + "<br>\n Ataque: " + getAtaqueBasico()
                + "<br>\n Defesa: " + getDefesaBasica()
                + "<br>\n Ataque Especial: " + getAtaqueEspecial()
                + "<br>\n Defesa Especial: " + getDefesaEspecial()
                + "<br>\n Velocidade: " + getVelocidade() + "\n";
    }

    Inseto g = new Inseto(ataqueBasico, ataqueEspecial);

    /**
     * Seleciona um ataque e retorna seu dano
     *
     * @return
     */
    public int atacar()
    {

        dano = g.escolheAtaqueInseto();
        return dano;

    }

    /**
     * Define de acordo com 1/4 de chance de sair determinado ataque
     *
     * @return
     */
    public String qualAtaque()
    {
        int x = g.qualAtaque;
        switch (x)
        {
            case 0:
                return "Ataque Básico!";
            case 1:
                return "Ataque do tipo Inseto!  ==> " + "Zumbido de Inseto!";
            case 2:
                return "Ataque do tipo Inseto!  ==> " + "Mega Chifre!";
            case 3:
                return "Ataque do tipo Inseto!  ==> " + "Raio Sinalizador!";
            case 4:
                return "<br>Ataque do tipo Inseto!  ==> " + "Corte X! - ULTIMATE";
        }
        return "erro!";
    }

    /**
     * GETTERS E SETTERS
     *
     * @return
     */
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public float getPeso()
    {
        return peso;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    public String getSom()
    {
        return som;
    }

    public void setSom(String som)
    {
        this.som = som;
    }

    public int getNivel()
    {
        return nivel;
    }

    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }

    public int getXp()
    {
        return xp;
    }

    public void setXp(int xp)
    {
        this.xp = xp;
    }

    public int getQtdAtaques()
    {
        return qtdAtaques;
    }

    public void setQtdAtaques(int qtdAtaques)
    {
        this.qtdAtaques = qtdAtaques;
    }

    public int getHp()
    {
        return hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getAtaqueBasico()
    {
        return ataqueBasico;
    }

    public void setAtaqueBasico(int ataqueBasico)
    {
        this.ataqueBasico = ataqueBasico;
    }

    public int getDefesaBasica()
    {
        return defesaBasica;
    }

    public void setDefesaBasica(int defesaBasica)
    {
        this.defesaBasica = defesaBasica;
    }

    public int getAtaqueEspecial()
    {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial)
    {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefesaEspecial()
    {
        return defesaEspecial;
    }

    public void setDefesaEspecial(int defesaEspecial)
    {
        this.defesaEspecial = defesaEspecial;
    }

    public int getVelocidade()
    {
        return velocidade;
    }

    public void setVelocidade(int velocidade)
    {
        this.velocidade = velocidade;
    }

    public int getDano()
    {
        return dano;
    }

    public void setDano(int dano)
    {
        this.dano = dano;
    }

}
