import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  template: `
    <h2>Movie Ticket Booking App</h2>

    <button (click)="loadMovies()">Load Movies</button>

    <ul>
      <li *ngFor="let movie of movies">
        {{movie}}
      </li>
    </ul>
  `
})
export class HomeComponent {

  movies:any[] = [];

  loadMovies() {
    fetch('http://localhost:8080/movies')
      .then(res => res.json())
      .then(data => this.movies = data);
  }
}