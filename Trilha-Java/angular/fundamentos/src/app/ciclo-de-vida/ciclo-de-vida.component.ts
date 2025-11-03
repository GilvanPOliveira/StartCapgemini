import { Component, Input, OnChanges, OnInit, SimpleChanges, Inject, PLATFORM_ID } from '@angular/core';
import { CommonModule, isPlatformBrowser } from '@angular/common';
import { LoggerService } from '../logger.service';

@Component({
  selector: 'app-ciclo-de-vida',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './ciclo-de-vida.component.html',
  styleUrls: ['./ciclo-de-vida.component.css']
})
export class CicloDeVidaComponent implements OnInit, OnChanges {
  horario = new Date();
  timer: any = null;

  @Input() texto = "";

  constructor(
    private logger: LoggerService,
    @Inject(PLATFORM_ID) private platformId: Object
  ) {}

  ngOnInit(): void {
    console.log('O evento OnInit disparou');
    if (isPlatformBrowser(this.platformId)) {
      this.timer = setInterval(() => {
        this.horario = new Date();
      }, 1000);
    }
  }
  ngOnChanges(changes: SimpleChanges): void {
    console.log(changes);
  }

  ngOnDestroy() {
    clearInterval(this.timer);
  }
}
