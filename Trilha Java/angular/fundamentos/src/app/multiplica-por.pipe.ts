import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'multiplicaPor',
  standalone: true
})
export class MultiplicaPorPipe implements PipeTransform {

  transform(valor: number, multiplicador: number): unknown {
    return valor * multiplicador
  }
}
