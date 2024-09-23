<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

Route::get('/clients/enregistrement', function () {
    return "Clients enregistrement";
});

Route::get('/clients/enregistrer', function () {
    return "Clients enregistrés";
});

Route::get('/clients/connexion', function () {
    return "Connexion des clients";
});

Route::get('/clients/connecter', function () {
    return "Clients connectés";
});

Route::get('/clients/espace', function () {
    return "Espace client";
});

Route::get('/clients/profil', function () {
    return "Consulter le profil";
});

Route::get('/clients/deconnecter', function () {
    return "Clients déconnectés";
});


Route::get('/ateliers/programmes', function () {
    return "Consulter les programmes d'atelier";
});

Route::get('/ateliers/passes', function () {
    return "Consulter les ateliers passés";
});

// Participation route with dynamic parameter
Route::get('/participation/{numAtelier}/proceder', function ($numAtelier) {
    return "Inscription à l'atelier numéro " . $numAtelier;
})->where('numAtelier', '[0-9]+'); // Contrainte pour accepter uniquement des chiffres

Route::get('/participation/{numAtelier}/annuler', function ($numAtelier) {
    return "Désinscription à l'atelier numéro " . $numAtelier;
})->where('numAtelier', '[0-9]+'); 

Route::get('/ateliers/{numAtelier}/commentaires/voir', function ($numAtelier) {
    return "Voir les commentaire de l'atelier numéro " . $numAtelier;
})->where('numAtelier', '[0-9]+'); 

Route::get('/ateliers/{numAtelier}/commenter', function ($numAtelier) {
    return "Coomenter un atelier numéro " . $numAtelier;
})->where('numAtelier', '[0-9]+'); 

Route::fallback(function () {
    return response()->view('errors.404', [], 404);
});
