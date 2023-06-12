import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AggiungiPastoComponent } from './aggiungi-pasto.component';

describe('AggiungiPastoComponent', () => {
  let component: AggiungiPastoComponent;
  let fixture: ComponentFixture<AggiungiPastoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AggiungiPastoComponent]
    });
    fixture = TestBed.createComponent(AggiungiPastoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
