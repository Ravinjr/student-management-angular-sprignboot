import { Component,Output,EventEmitter } from '@angular/core';
// import { Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrl: './button.component.css'
})
export class ButtonComponent {

  @Output() onShowHideBtnClick: EventEmitter<boolean> = new EventEmitter<boolean>();
  isButtonClick:boolean=false;

  onBtnClick(){
    this.isButtonClick = !this.isButtonClick;
    console.log(this.isButtonClick);
    this.onShowHideBtnClick.emit(this.isButtonClick)
    // console.log("this.isButtonClick ", this.isButtonClick)
  }

}
