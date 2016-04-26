/**
 * sistemaLinear.h
 *
 * Definição do sistema linear: estrutura
 * e funções condizentes com o mesmo.
 *
 */

#ifndef SISTEMALINEAR_H
#define SISTEMALINEAR_H

#include <stdio.h>
#include <stdlib.h>
#include "matrizPentadiagonal.h"

// Variável global que identifica
// o experimento a ser efetuado
extern int flagExp;

/*
 * Estrutura da matriz composta por 5
 * vetores, representando as diagonais
 * e a ordem da matriz
 */
typedef struct sistemaLinear
{
    MatrizPentadiagonal* matriz;
    double* f; // Vetor independente
    size_t N;  // Ordem do sistema
} SistemaLinear;

/** Funções **/
SistemaLinear* criaSistemaLinear(MatrizPentadiagonal*, double*, const size_t);
Ponto* discretizaDominio(Dados*);
double *criaVetorIndependente(Dados*, Ponto*);
void montaVetorIndependenteV1(double*, const int);
void montaVetorIndependenteV2(double*, Ponto*, const int);
void montaVetorIndependenteA1(double*, const int);
void montaVetorIndependenteA2(double*, Ponto*, const int);
void aplicaContorno(SistemaLinear*, Dados*);
void aplicaContornoValidacao1(SistemaLinear*, Dados*);
void aplicaContornoValidacao2(SistemaLinear*, Dados*);
void aplicaContornoAplicacao1(SistemaLinear*, Dados*);
void aplicaContornoAplicacao2(SistemaLinear*, Dados*);
int indiceDiscreto(int, int, int);
void printSistemaLinear(SistemaLinear*);
void freeSistemaLinear(SistemaLinear*);

#endif