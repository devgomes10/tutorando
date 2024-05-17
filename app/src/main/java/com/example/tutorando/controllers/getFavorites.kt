package com.example.tutorando.controllers

import com.example.tutorando.models.Person

fun getFavorites(): List<Person> {
    return listOf(
        Person(id = 1, name = "João", skills = listOf("Kotlin", "Flutter"), about = "Olá, eu sou o João e quero aprender Kotlin e Flutter para desenvolver apps incríveis.", city = "São Paulo", phone = 11912345678),
        Person(id = 2, name = "Maria", skills = listOf("Swift", "React Native"), about = "Oi, sou a Maria. Estou focada em aprender Swift e React Native para criar soluções inovadoras.", city = "Rio de Janeiro", phone = 21987654321),
        Person(id = 3, name = "Pedro", skills = listOf("Flutter", "Kotlin"), about = "Olá, me chamo Pedro e estou interessado em aprender Flutter e Kotlin para aprimorar minhas habilidades em desenvolvimento mobile.", city = "Belo Horizonte", phone = 31987651234),
        Person(id = 4, name = "Ana", skills = listOf("Kotlin", "React Native"), about = "Oi, sou a Ana e quero aprender Kotlin e React Native para desenvolver aplicativos que façam a diferença.", city = "Curitiba", phone = 41912344321),
        Person(id = 5, name = "Carlos", skills = listOf("Swift", "Flutter"), about = "Olá, meu nome é Carlos e estou aprendendo Swift e Flutter para criar apps robustos e eficientes.", city = "Salvador", phone = 71998765432),
        Person(id = 6, name = "Fernanda", skills = listOf("React Native", "Kotlin"), about = "Oi, sou a Fernanda. Estou entusiasmada para aprender React Native e Kotlin e desenvolver aplicativos incríveis.", city = "Fortaleza", phone = 85912349876),
        Person(id = 7, name = "Rafael", skills = listOf("Flutter", "Swift"), about = "Olá, eu sou o Rafael e estou focado em aprender Flutter e Swift para entrar no mercado de desenvolvimento mobile.", city = "Porto Alegre", phone = 51998764321),
        Person(id = 8, name = "Camila", skills = listOf("Kotlin", "Swift"), about = "Oi, sou a Camila e quero dominar Kotlin e Swift para criar aplicativos de alta qualidade.", city = "Recife", phone = 81987653210),
        Person(id = 9, name = "Lucas", skills = listOf("React Native", "Flutter"), about = "Olá, sou o Lucas e estou aprendendo React Native e Flutter para me tornar um desenvolvedor mobile completo.", city = "Manaus", phone = 92912340987),
        Person(id = 10, name = "Larissa", skills = listOf("Swift", "Kotlin"), about = "Oi, sou a Larissa e estou entusiasmada para aprender Swift e Kotlin e desenvolver apps inovadores.", city = "Belém", phone = 91987654567),
        Person(id = 11, name = "Gustavo", skills = listOf("Flutter", "React Native"), about = "Olá, sou o Gustavo e estou interessado em aprender Flutter e React Native para expandir minhas habilidades de desenvolvimento.", city = "Goiânia", phone = 62912349876),
        Person(id = 12, name = "Beatriz", skills = listOf("Kotlin", "Flutter"), about = "Oi, sou a Beatriz. Quero aprender Kotlin e Flutter para criar aplicativos úteis e eficientes.", city = "Florianópolis", phone = 48987654321),
        Person(id = 13, name = "André", skills = listOf("Swift", "React Native"), about = "Olá, meu nome é André e estou focado em aprender Swift e React Native para desenvolver soluções mobile inovadoras.", city = "Natal", phone = 84912345678),
        Person(id = 14, name = "Patrícia", skills = listOf("Flutter", "Kotlin"), about = "Oi, sou a Patrícia e estou aprendendo Flutter e Kotlin para criar apps incríveis e dinâmicos.", city = "Vitória", phone = 27987653210),
        Person(id = 15, name = "Rodrigo", skills = listOf("React Native", "Swift"), about = "Olá, sou o Rodrigo. Estou interessado em aprender React Native e Swift para desenvolver aplicativos eficientes e modernos.", city = "Brasília", phone = 61912349876)
    )
}
