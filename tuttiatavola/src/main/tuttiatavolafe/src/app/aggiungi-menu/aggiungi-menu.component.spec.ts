import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AggiungiMenuComponent } from './aggiungi-menu.component';

describe('AggiungiMenuComponent', () => {
  let component: AggiungiMenuComponent;
  let fixture: ComponentFixture<AggiungiMenuComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AggiungiMenuComponent]
    });
    fixture = TestBed.createComponent(AggiungiMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
