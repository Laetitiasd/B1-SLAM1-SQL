<?php

use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
});

// Routes clients
Route::get('/clients/enregistrement', function () {
    return "Enregistrement d'un client";
});

Route::get('/clients/enregistrer', function () {
    return "Client enregistré avec succès";
});

Route::get('/clients/connexion', function () {
    return "Connexion du client";
});

Route::get('/clients/connecter', function () {
    return "Client connecté avec succès";
});

Route::get('/clients/espace', function () {
    return "Espace client";
});

Route::get('/clients/profil', function () {
    return "Consulter le profil";
});

Route::get('/clients/deconnecter', function () {
    return "Client déconnecté avec succès";
});

// Routes ateliers
Route::get('/ateliers/programmes', function () {
    return "Consulter les programmes d'ateliers";
});

Route::get('/ateliers/passes', function () {
    return "Consulter les ateliers passés";
});

// Routes participations avec paramètre dynamique
Route::get('/participation/{numAtelier}/proceder', function ($numAtelier) {
    return "Inscription à l'atelier numéro " . $numAtelier;
})->where('numAtelier', '[0-9]+');

Route::get('/participation/{numAtelier}/annuler', function ($numAtelier) {
    return "Désinscription de l'atelier numéro " . $numAtelier;
})->where('numAtelier', '[0-9]+');

// Routes commentaires d'ateliers
Route::get('/ateliers/{numAtelier}/commentaires/voir', function ($numAtelier) {
    return "Voir les commentaires de l'atelier numéro " . $numAtelier;
})->where('numAtelier', '[0-9]+');

Route::get('/ateliers/{numAtelier}/commenter', function ($numAtelier) {
    return "Commenter l'atelier numéro " . $numAtelier;
})->where('numAtelier', '[0-9]+');

// Fallback route
Route::fallback(function () {
    return response()->view('errors.404', [], 404);
});
