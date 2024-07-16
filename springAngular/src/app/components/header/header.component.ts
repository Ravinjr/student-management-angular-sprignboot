import { Component, Output,EventEmitter } from '@angular/core';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})

export class HeaderComponent {
  @Output() onShowTable: EventEmitter<boolean> = new EventEmitter<boolean>();
  onShowHideBtnClick(isButtonClick:boolean){
   this.onShowTable.emit(isButtonClick);
  }
}
