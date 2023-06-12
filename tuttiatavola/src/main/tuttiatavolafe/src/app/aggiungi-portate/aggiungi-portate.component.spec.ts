import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AggiungiPortateComponent } from './aggiungi-portate.component';

describe('AggiungiPortateComponent', () => {
  let component: AggiungiPortateComponent;
  let fixture: ComponentFixture<AggiungiPortateComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AggiungiPortateComponent]
    });
    fixture = TestBed.createComponent(AggiungiPortateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
